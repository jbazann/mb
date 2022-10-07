/**
 */
package unifilar290922;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see unifilar290922.Unifilar290922Factory
 * @model kind="package"
 * @generated
 */
public interface Unifilar290922Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "unifilar290922";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/unifilar290922";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "unifilar290922";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Unifilar290922Package eINSTANCE = unifilar290922.impl.Unifilar290922PackageImpl.init();

	/**
	 * The meta object id for the '{@link unifilar290922.impl.OneLineDiagramImpl <em>One Line Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.OneLineDiagramImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getOneLineDiagram()
	 * @generated
	 */
	int ONE_LINE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM__LOAD = 0;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM__GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM__LINE = 2;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM__BUS = 3;

	/**
	 * The number of structural features of the '<em>One Line Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>One Line Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ONE_LINE_DIAGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.LoadImpl <em>Load</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.LoadImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLoad()
	 * @generated
	 */
	int LOAD = 1;

	/**
	 * The feature id for the '<em><b>Load Bus Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD__LOAD_BUS_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Load</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.BusImpl <em>Bus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.BusImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getBus()
	 * @generated
	 */
	int BUS = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LINE = 0;

	/**
	 * The feature id for the '<em><b>Load Bus Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__LOAD_BUS_ASSOCIATION = 1;

	/**
	 * The feature id for the '<em><b>Generator Bus Association</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS__GENERATOR_BUS_ASSOCIATION = 2;

	/**
	 * The number of structural features of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.LineImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLine()
	 * @generated
	 */
	int LINE = 3;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__BUS = 0;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.LoadBusAssociationImpl <em>Load Bus Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.LoadBusAssociationImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLoadBusAssociation()
	 * @generated
	 */
	int LOAD_BUS_ASSOCIATION = 4;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BUS_ASSOCIATION__BUS = 0;

	/**
	 * The feature id for the '<em><b>Load</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BUS_ASSOCIATION__LOAD = 1;

	/**
	 * The number of structural features of the '<em>Load Bus Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BUS_ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Load Bus Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOAD_BUS_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.GeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.GeneratorImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getGenerator()
	 * @generated
	 */
	int GENERATOR = 5;

	/**
	 * The feature id for the '<em><b>Generator Bus Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR__GENERATOR_BUS_ASSOCIATION = 0;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link unifilar290922.impl.GeneratorBusAssociationImpl <em>Generator Bus Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see unifilar290922.impl.GeneratorBusAssociationImpl
	 * @see unifilar290922.impl.Unifilar290922PackageImpl#getGeneratorBusAssociation()
	 * @generated
	 */
	int GENERATOR_BUS_ASSOCIATION = 6;

	/**
	 * The feature id for the '<em><b>Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_BUS_ASSOCIATION__GENERATOR = 0;

	/**
	 * The feature id for the '<em><b>Bus</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_BUS_ASSOCIATION__BUS = 1;

	/**
	 * The number of structural features of the '<em>Generator Bus Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_BUS_ASSOCIATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Generator Bus Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERATOR_BUS_ASSOCIATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link unifilar290922.OneLineDiagram <em>One Line Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>One Line Diagram</em>'.
	 * @see unifilar290922.OneLineDiagram
	 * @generated
	 */
	EClass getOneLineDiagram();

	/**
	 * Returns the meta object for the containment reference list '{@link unifilar290922.OneLineDiagram#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Load</em>'.
	 * @see unifilar290922.OneLineDiagram#getLoad()
	 * @see #getOneLineDiagram()
	 * @generated
	 */
	EReference getOneLineDiagram_Load();

	/**
	 * Returns the meta object for the containment reference list '{@link unifilar290922.OneLineDiagram#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generator</em>'.
	 * @see unifilar290922.OneLineDiagram#getGenerator()
	 * @see #getOneLineDiagram()
	 * @generated
	 */
	EReference getOneLineDiagram_Generator();

	/**
	 * Returns the meta object for the containment reference list '{@link unifilar290922.OneLineDiagram#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Line</em>'.
	 * @see unifilar290922.OneLineDiagram#getLine()
	 * @see #getOneLineDiagram()
	 * @generated
	 */
	EReference getOneLineDiagram_Line();

	/**
	 * Returns the meta object for the containment reference list '{@link unifilar290922.OneLineDiagram#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bus</em>'.
	 * @see unifilar290922.OneLineDiagram#getBus()
	 * @see #getOneLineDiagram()
	 * @generated
	 */
	EReference getOneLineDiagram_Bus();

	/**
	 * Returns the meta object for class '{@link unifilar290922.Load <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load</em>'.
	 * @see unifilar290922.Load
	 * @generated
	 */
	EClass getLoad();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.Load#getLoadBusAssociation <em>Load Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load Bus Association</em>'.
	 * @see unifilar290922.Load#getLoadBusAssociation()
	 * @see #getLoad()
	 * @generated
	 */
	EReference getLoad_LoadBusAssociation();

	/**
	 * Returns the meta object for class '{@link unifilar290922.Bus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bus</em>'.
	 * @see unifilar290922.Bus
	 * @generated
	 */
	EClass getBus();

	/**
	 * Returns the meta object for the reference list '{@link unifilar290922.Bus#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Line</em>'.
	 * @see unifilar290922.Bus#getLine()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_Line();

	/**
	 * Returns the meta object for the reference list '{@link unifilar290922.Bus#getLoadBusAssociation <em>Load Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Load Bus Association</em>'.
	 * @see unifilar290922.Bus#getLoadBusAssociation()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_LoadBusAssociation();

	/**
	 * Returns the meta object for the reference list '{@link unifilar290922.Bus#getGeneratorBusAssociation <em>Generator Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generator Bus Association</em>'.
	 * @see unifilar290922.Bus#getGeneratorBusAssociation()
	 * @see #getBus()
	 * @generated
	 */
	EReference getBus_GeneratorBusAssociation();

	/**
	 * Returns the meta object for class '{@link unifilar290922.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see unifilar290922.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for the reference list '{@link unifilar290922.Line#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bus</em>'.
	 * @see unifilar290922.Line#getBus()
	 * @see #getLine()
	 * @generated
	 */
	EReference getLine_Bus();

	/**
	 * Returns the meta object for class '{@link unifilar290922.LoadBusAssociation <em>Load Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Load Bus Association</em>'.
	 * @see unifilar290922.LoadBusAssociation
	 * @generated
	 */
	EClass getLoadBusAssociation();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.LoadBusAssociation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see unifilar290922.LoadBusAssociation#getBus()
	 * @see #getLoadBusAssociation()
	 * @generated
	 */
	EReference getLoadBusAssociation_Bus();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.LoadBusAssociation#getLoad <em>Load</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Load</em>'.
	 * @see unifilar290922.LoadBusAssociation#getLoad()
	 * @see #getLoadBusAssociation()
	 * @generated
	 */
	EReference getLoadBusAssociation_Load();

	/**
	 * Returns the meta object for class '{@link unifilar290922.Generator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see unifilar290922.Generator
	 * @generated
	 */
	EClass getGenerator();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.Generator#getGeneratorBusAssociation <em>Generator Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator Bus Association</em>'.
	 * @see unifilar290922.Generator#getGeneratorBusAssociation()
	 * @see #getGenerator()
	 * @generated
	 */
	EReference getGenerator_GeneratorBusAssociation();

	/**
	 * Returns the meta object for class '{@link unifilar290922.GeneratorBusAssociation <em>Generator Bus Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Bus Association</em>'.
	 * @see unifilar290922.GeneratorBusAssociation
	 * @generated
	 */
	EClass getGeneratorBusAssociation();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.GeneratorBusAssociation#getGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator</em>'.
	 * @see unifilar290922.GeneratorBusAssociation#getGenerator()
	 * @see #getGeneratorBusAssociation()
	 * @generated
	 */
	EReference getGeneratorBusAssociation_Generator();

	/**
	 * Returns the meta object for the reference '{@link unifilar290922.GeneratorBusAssociation#getBus <em>Bus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bus</em>'.
	 * @see unifilar290922.GeneratorBusAssociation#getBus()
	 * @see #getGeneratorBusAssociation()
	 * @generated
	 */
	EReference getGeneratorBusAssociation_Bus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Unifilar290922Factory getUnifilar290922Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link unifilar290922.impl.OneLineDiagramImpl <em>One Line Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.OneLineDiagramImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getOneLineDiagram()
		 * @generated
		 */
		EClass ONE_LINE_DIAGRAM = eINSTANCE.getOneLineDiagram();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_LINE_DIAGRAM__LOAD = eINSTANCE.getOneLineDiagram_Load();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_LINE_DIAGRAM__GENERATOR = eINSTANCE.getOneLineDiagram_Generator();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_LINE_DIAGRAM__LINE = eINSTANCE.getOneLineDiagram_Line();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ONE_LINE_DIAGRAM__BUS = eINSTANCE.getOneLineDiagram_Bus();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.LoadImpl <em>Load</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.LoadImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLoad()
		 * @generated
		 */
		EClass LOAD = eINSTANCE.getLoad();

		/**
		 * The meta object literal for the '<em><b>Load Bus Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD__LOAD_BUS_ASSOCIATION = eINSTANCE.getLoad_LoadBusAssociation();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.BusImpl <em>Bus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.BusImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getBus()
		 * @generated
		 */
		EClass BUS = eINSTANCE.getBus();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LINE = eINSTANCE.getBus_Line();

		/**
		 * The meta object literal for the '<em><b>Load Bus Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__LOAD_BUS_ASSOCIATION = eINSTANCE.getBus_LoadBusAssociation();

		/**
		 * The meta object literal for the '<em><b>Generator Bus Association</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BUS__GENERATOR_BUS_ASSOCIATION = eINSTANCE.getBus_GeneratorBusAssociation();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.LineImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE__BUS = eINSTANCE.getLine_Bus();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.LoadBusAssociationImpl <em>Load Bus Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.LoadBusAssociationImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getLoadBusAssociation()
		 * @generated
		 */
		EClass LOAD_BUS_ASSOCIATION = eINSTANCE.getLoadBusAssociation();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BUS_ASSOCIATION__BUS = eINSTANCE.getLoadBusAssociation_Bus();

		/**
		 * The meta object literal for the '<em><b>Load</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOAD_BUS_ASSOCIATION__LOAD = eINSTANCE.getLoadBusAssociation_Load();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.GeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.GeneratorImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getGenerator()
		 * @generated
		 */
		EClass GENERATOR = eINSTANCE.getGenerator();

		/**
		 * The meta object literal for the '<em><b>Generator Bus Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR__GENERATOR_BUS_ASSOCIATION = eINSTANCE.getGenerator_GeneratorBusAssociation();

		/**
		 * The meta object literal for the '{@link unifilar290922.impl.GeneratorBusAssociationImpl <em>Generator Bus Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see unifilar290922.impl.GeneratorBusAssociationImpl
		 * @see unifilar290922.impl.Unifilar290922PackageImpl#getGeneratorBusAssociation()
		 * @generated
		 */
		EClass GENERATOR_BUS_ASSOCIATION = eINSTANCE.getGeneratorBusAssociation();

		/**
		 * The meta object literal for the '<em><b>Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_BUS_ASSOCIATION__GENERATOR = eINSTANCE.getGeneratorBusAssociation_Generator();

		/**
		 * The meta object literal for the '<em><b>Bus</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GENERATOR_BUS_ASSOCIATION__BUS = eINSTANCE.getGeneratorBusAssociation_Bus();

	}

} //Unifilar290922Package
