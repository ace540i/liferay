/* ===================================================================*/
/* � 2015 Fresenius Medical Care Holdings, Inc. All rights reserved.  */
/* ===================================================================*/
package com.spectra.symfonielabs.dao;

import com.spectra.symfonielabs.domainobject.Accession;
import com.spectra.symfonielabs.domainobject.Equipment;
//import com.spectra.symfonielabs.domainobject.OrderSummary;
import com.spectra.symfonielabs.domainobject.OrderEquipmentSummary;
import com.spectra.symfonielabs.domainobject.RequisitionDetails;
import com.spectra.symfonielabs.domainobject.Results;
import com.spectra.symfonielabs.domainobject.Search;

import java.util.Date;
import java.util.List;


/**
 * This contains the implementation methods that are available in the interface.
 * 
 */
public interface EquipmentDAO {

	/**
	 * Gets the search results for the patient.
	 * 
	 * @param facilityId
	 *            - Holds the facility Id.
	 * @param patName
	 *            - Holds the patient name.
	 * @return list of SearchResult - Holds the search details.
	 * 
	 */
	List<Equipment> getSearchResult(final Search equipmentSearch);
	
	/**
	 * This method is used to display patient details.
	 * 
	 * @param facilityId
	 *            - Holds the facility id.
	 * @param spectraMRN
	 *            - Holds the spectra MRN.
	 * @return An object of PatientResult.
	 */
	Equipment getEquipmentDetails(final long facilityId, final String spectraMRN);
	
	/**
	 * This method is used to display requisition patient details.
	 * 
	 * @param facilityNum
	 *            - Holds the facility number.
	 * @param requisitionNum
	 *            - Holds the requisition number.
	 * @return An object of PatientResult.
	 */
	Equipment getEquipmentReqInfo(final String facilityNum,
			final String requisitionNum);
	
	

	/**
	 * This method is used to get all the order details.
	 * 
	 * @param facilityId
	 *            - Holds the facility id.
	 * @param spectraMRN
	 *            - Holds the spectra MRN.
	 * @param drawDate
	 *            - Holds the draw date.
	 * @return A list of OrderSummary object.
	 */
	List<OrderEquipmentSummary> getOrderSummary(final long facilityId,
			final long spectraMRN, final Date drawDate, final OrderEquipmentSummary orderSumm);
	
	/**
	 * This method is used to get the tube summary details.
	 * 
	 * @param requisitionNo
	 *            - Holds the requisition number.
	 * @return A list of object OrderSummary.
	 */
	List<Accession> getTubeSummary(final String requisitionNo);
	
	/**
	 * This method is used to get the order details based on requisition number.
	 * 
	 * @param requisitionNo
	 *            - Holds the requisition number.
	 * @return A list of Results.
	 */
	List<Results> getOrderTestDetails(final String requisitionNo);
	/**
	 * This method is used to display requisition patient details.
	 * 
	 * @param facilityNum
	 *            - Holds the facility number.
	 * @param requisitionNum
	 *            - Holds the requisition number.
	 * @return An object of RequisitionDetails.
	 */
	RequisitionDetails getPatientReqInfo(final String facilityNum,
			final String requisitionNum);

}