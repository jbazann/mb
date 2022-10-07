/**
 */
package unifilar290922;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Load Bus Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.LoadBusAssociation#getBus <em>Bus</em>}</li>
 *   <li>{@link unifilar290922.LoadBusAssociation#getLoad <em>Load</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getLoadBusAssociation()
 * @model
 * @generated
 */
public interface LoadBusAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Bus#getLoadBusAssociation <em>Load Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see unifilar290922.Unifilar290922Package#getLoadBusAssociation_Bus()
	 * @see unifilar290922.Bus#getLoadBusAssociation
	 * @model opposite="loadBusAssociation" required="true"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link unifilar290922.LoadBusAssociation#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

	/**
	 * Returns the value of the '<em><b>Load</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Load#getLoadBusAssociation <em>Load Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' reference.
	 * @see #setLoad(Load)
	 * @see unifilar290922.Unifilar290922Package#getLoadBusAssociation_Load()
	 * @see unifilar290922.Load#getLoadBusAssociation
	 * @model opposite="loadBusAssociation" required="true"
	 * @generated
	 */
	Load getLoad();

	/**
	 * Sets the value of the '{@link unifilar290922.LoadBusAssociation#getLoad <em>Load</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load</em>' reference.
	 * @see #getLoad()
	 * @generated
	 */
	void setLoad(Load value);

} // LoadBusAssociation
