/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.dts.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dts.core.util.CoreHash;
import com.dts.crsm.dao.CategoryDAO;

/** 
 * MyEclipse Struts
 * Creation date: 01-23-2009
 * 
 * XDoclet definition:
 * @struts.action validate="true"
 */
public class EmployeeViewCategoriesAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		try{ 
			CategoryDAO categorydao = new CategoryDAO();
		
         CoreHash aCoreHash = categorydao.listCategories();
        int size=aCoreHash.size();
        if(size!=0)
        {
        	request.setAttribute("ViewCategories",aCoreHash);
        	return mapping.findForward("ViewCategories");
        }
	}catch (Exception e) {
		// TODO: handle exception
	}
	return mapping.findForward("ViewCategories");
	}
}