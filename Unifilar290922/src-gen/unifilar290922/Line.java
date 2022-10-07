/**
 */
package unifilar290922;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.Line#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getLine()
 * @model
 * @generated
 */
public interface Line extends EObject {
	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference list.
	 * The list contents are of type {@link unifilar290922.Bus}.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Bus#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference list.
	 * @see unifilar290922.Unifilar290922Package#getLine_Bus()
	 * @see unifilar290922.Bus#getLine
	 * @model opposite="line" lower="2" upper="2"
	 * @generated
	 */
	EList<Bus> getBus();

} // Line
