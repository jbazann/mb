/**
 */
package unifilar290922;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Bus Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.GeneratorBusAssociation#getGenerator <em>Generator</em>}</li>
 *   <li>{@link unifilar290922.GeneratorBusAssociation#getBus <em>Bus</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getGeneratorBusAssociation()
 * @model
 * @generated
 */
public interface GeneratorBusAssociation extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Generator#getGeneratorBusAssociation <em>Generator Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator</em>' reference.
	 * @see #setGenerator(Generator)
	 * @see unifilar290922.Unifilar290922Package#getGeneratorBusAssociation_Generator()
	 * @see unifilar290922.Generator#getGeneratorBusAssociation
	 * @model opposite="generatorBusAssociation" required="true"
	 * @generated
	 */
	Generator getGenerator();

	/**
	 * Sets the value of the '{@link unifilar290922.GeneratorBusAssociation#getGenerator <em>Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator</em>' reference.
	 * @see #getGenerator()
	 * @generated
	 */
	void setGenerator(Generator value);

	/**
	 * Returns the value of the '<em><b>Bus</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.Bus#getGeneratorBusAssociation <em>Generator Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bus</em>' reference.
	 * @see #setBus(Bus)
	 * @see unifilar290922.Unifilar290922Package#getGeneratorBusAssociation_Bus()
	 * @see unifilar290922.Bus#getGeneratorBusAssociation
	 * @model opposite="generatorBusAssociation" required="true"
	 * @generated
	 */
	Bus getBus();

	/**
	 * Sets the value of the '{@link unifilar290922.GeneratorBusAssociation#getBus <em>Bus</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bus</em>' reference.
	 * @see #getBus()
	 * @generated
	 */
	void setBus(Bus value);

} // GeneratorBusAssociation
