/**
 */
package unifilar290922;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.Load#getLoadBusAssociation <em>Load Bus Association</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getLoad()
 * @model
 * @generated
 */
public interface Load extends EObject {
	/**
	 * Returns the value of the '<em><b>Load Bus Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.LoadBusAssociation#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Bus Association</em>' reference.
	 * @see #setLoadBusAssociation(LoadBusAssociation)
	 * @see unifilar290922.Unifilar290922Package#getLoad_LoadBusAssociation()
	 * @see unifilar290922.LoadBusAssociation#getLoad
	 * @model opposite="load" required="true"
	 * @generated
	 */
	LoadBusAssociation getLoadBusAssociation();

	/**
	 * Sets the value of the '{@link unifilar290922.Load#getLoadBusAssociation <em>Load Bus Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Bus Association</em>' reference.
	 * @see #getLoadBusAssociation()
	 * @generated
	 */
	void setLoadBusAssociation(LoadBusAssociation value);

} // Load
