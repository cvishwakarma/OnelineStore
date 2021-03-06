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
import com.dts.crsm.dao.OrdersDAO;

/** 
 * MyEclipse Struts
 * Creation date: 12-24-2008
 * 
 * XDoclet definition:
 * @struts.action
 */
public class CustomerOrders extends Action {
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
			CoreHash aCoreHash = new OrdersDAO().listOrdersOfAllUser("customer");
		int size=aCoreHash.size();
		if(size!=0)
		{
			request.setAttribute("viewCoreHash",aCoreHash);
			return mapping.findForward("ViewCustomerOrders");
		}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return mapping.findForward("norecords");
	}
}