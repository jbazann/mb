/**
 */
package unifilar290922;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.Bus#getLine <em>Line</em>}</li>
 *   <li>{@link unifilar290922.Bus#getLoadBusAssociation <em>Load Bus Association</em>}</li>
 *   <li>{@link unifilar290922.Bus#getGeneratorBusAssociation <em>Generator Bus Association</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getBus()
 * @model
 * @generated
 */
public interface Bus extends EObject {
	/**
	 * Returns the value of the '<em><b>Line</b></em>' reference list.
	 * The list contents are of type {@link unifilar290922.Line}.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Line#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' reference list.
	 * @see unifilar290922.Unifilar290922Package#getBus_Line()
	 * @see unifilar290922.Line#getBus
	 * @model opposite="bus"
	 * @generated
	 */
	EList<Line> getLine();

	/**
	 * Returns the value of the '<em><b>Load Bus Association</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.LoadBusAssociation}.
	 * It is bidirectional and its opposite is '{@link unifilar290922.LoadBusAssociation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load Bus Association</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getBus_LoadBusAssociation()
	 * @see unifilar290922.LoadBusAssociation#getBus
	 * @model opposite="bus" containment="true"
	 * @generated
	 */
	EList<LoadBusAssociation> getLoadBusAssociation();

	/**
	 * Returns the value of the '<em><b>Generator Bus Association</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.GeneratorBusAssociation}.
	 * It is bidirectional and its opposite is '{@link unifilar290922.GeneratorBusAssociation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Bus Association</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getBus_GeneratorBusAssociation()
	 * @see unifilar290922.GeneratorBusAssociation#getBus
	 * @model opposite="bus" containment="true"
	 * @generated
	 */
	EList<GeneratorBusAssociation> getGeneratorBusAssociation();

} // Bus
