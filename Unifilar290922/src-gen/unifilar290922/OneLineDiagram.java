/**
 */
package unifilar290922;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>One Line Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.OneLineDiagram#getLoad <em>Load</em>}</li>
 *   <li>{@link unifilar290922.OneLineDiagram#getGenerator <em>Generator</em>}</li>
 *   <li>{@link unifilar290922.OneLineDiagram#getLine <em>Line</em>}</li>
 *   <li>{@link unifilar290922.OneLineDiagram#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getOneLineDiagram()
 * @model
 * @generated
 */
public interface OneLineDiagram extends EObject {
	/**
	 * Returns the value of the '<em><b>Load</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.Load}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Load</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getOneLineDiagram_Load()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Load> getLoad();

	/**
	 * Returns the value of the '<em><b>Generator</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.Generator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getOneLineDiagram_Generator()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Generator> getGenerator();

	/**
	 * Returns the value of the '<em><b>Line</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.Line}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getOneLineDiagram_Line()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Line> getLine();

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' containment reference list.
	 * The list contents are of type {@link unifilar290922.Bus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' containment reference list.
	 * @see unifilar290922.Unifilar290922Package#getOneLineDiagram_Bus()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Bus> getBus();

} // OneLineDiagram
