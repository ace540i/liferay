/* ===================================================================*/
/* � 2015 Fresenius Medical Care Holdings, Inc. All rights reserved.  */
/* ===================================================================*/
/* 12/22/2015 - md - US1087 
 * 				1) New BO Class for Staff Orders. 
 */
package com.spectra.symfonielabs.businessobject;

import com.spectra.symfonie.framework.exception.BusinessException;
import com.spectra.symfonielabs.domainobject.Accession;
import com.spectra.symfonielabs.domainobject.OrderStaffSummary;
import com.spectra.symfonielabs.domainobject.Results;
import com.spectra.symfonielabs.domainobject.StaffRequisitionDetails;
import java.util.Date;
import java.util.List;

/**
 * This interface contains methods that is used to have order related
 * activities.
 * 
 */
public interface OrderStaffBO {

	/**
	 * This method is used to get all the order details.
	 * 
	 * @param facilityId
	 *            - Holds the facility id.
	 * @param spectraMRN
	 *            - Holds the spectra MRN.
	 * @param drawDate
	 *            - Holds the draw date.
	 * @return A list of OrderStaffSummary object.
	 */
	List<OrderStaffSummary> getOrderStaffSummary(final long facilityId,
			final long spectraMRN, final Date drawDate, final OrderStaffSummary orderSumm)
			throws BusinessException;

	/**
	 * This method is used to get the tube summary details.
	 * 
	 * @param requisitionNo
	 *            - Holds the requisition id.
	 * @return A list of object OrderStaffSummary.
	 */
	List<Accession> getTubeStaffSummary(final String requisitionNo)
			throws BusinessException;

	/**
	 * This method is used to get the order details based on requisition number.
	 * 
	 * @param requisitionNo
	 *            - Holds the requisition number.
	 * @return A list of Results object.
	 */
	List<Results> getOrderStaffTestDetails(final String requisitionNo)
			throws BusinessException;
	
	/**
	 * This method is used to display requisition staff details.
	 * 
	 * @param facilityNum
	 *            - Holds the facility number.
	 * @param requisitionNum
	 *            - Holds the requisition number.
	 * @return An object of StaffRequisitionDetails.
	 */
	StaffRequisitionDetails getReqStaffInfo(final String facilityNum,
			final String requisitionNum) throws BusinessException;
}
