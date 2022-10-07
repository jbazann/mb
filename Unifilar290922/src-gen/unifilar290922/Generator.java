/**
 */
package unifilar290922;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link unifilar290922.Generator#getGeneratorBusAssociation <em>Generator Bus Association</em>}</li>
 * </ul>
 *
 * @see unifilar290922.Unifilar290922Package#getGenerator()
 * @model
 * @generated
 */
public interface Generator extends EObject {
	/**
	 * Returns the value of the '<em><b>Generator Bus Association</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link unifilar290922.GeneratorBusAssociation#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Bus Association</em>' reference.
	 * @see #setGeneratorBusAssociation(GeneratorBusAssociation)
	 * @see unifilar290922.Unifilar290922Package#getGenerator_GeneratorBusAssociation()
	 * @see unifilar290922.GeneratorBusAssociation#getGenerator
	 * @model opposite="generator" required="true"
	 * @generated
	 */
	GeneratorBusAssociation getGeneratorBusAssociation();

	/**
	 * Sets the value of the '{@link unifilar290922.Generator#getGeneratorBusAssociation <em>Generator Bus Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Bus Association</em>' reference.
	 * @see #getGeneratorBusAssociation()
	 * @generated
	 */
	void setGeneratorBusAssociation(GeneratorBusAssociation value);

} // Generator
