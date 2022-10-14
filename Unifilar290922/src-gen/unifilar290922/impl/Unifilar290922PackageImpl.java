/**
 */
package unifilar290922.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import unifilar290922.Bus;
import unifilar290922.Generator;
import unifilar290922.GeneratorBusAssociation;
import unifilar290922.Line;
import unifilar290922.Load;
import unifilar290922.LoadBusAssociation;
import unifilar290922.OneLineDiagram;
import unifilar290922.Unifilar290922Factory;
import unifilar290922.Unifilar290922Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Unifilar290922PackageImpl extends EPackageImpl implements Unifilar290922Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oneLineDiagramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass busEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loadBusAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass generatorBusAssociationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see unifilar290922.Unifilar290922Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Unifilar290922PackageImpl() {
		super(eNS_URI, Unifilar290922Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Unifilar290922Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Unifilar290922Package init() {
		if (isInited)
			return (Unifilar290922Package) EPackage.Registry.INSTANCE.getEPackage(Unifilar290922Package.eNS_URI);

		// Obtain or create and register package
		Object registeredUnifilar290922Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Unifilar290922PackageImpl theUnifilar290922Package = registeredUnifilar290922Package instanceof Unifilar290922PackageImpl
				? (Unifilar290922PackageImpl) registeredUnifilar290922Package
				: new Unifilar290922PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUnifilar290922Package.createPackageContents();

		// Initialize created meta-data
		theUnifilar290922Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUnifilar290922Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Unifilar290922Package.eNS_URI, theUnifilar290922Package);
		return theUnifilar290922Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOneLineDiagram() {
		return oneLineDiagramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneLineDiagram_Load() {
		return (EReference) oneLineDiagramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneLineDiagram_Generator() {
		return (EReference) oneLineDiagramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneLineDiagram_Line() {
		return (EReference) oneLineDiagramEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOneLineDiagram_Bus() {
		return (EReference) oneLineDiagramEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoad() {
		return loadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoad_LoadBusAssociation() {
		return (EReference) loadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBus() {
		return busEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_Line() {
		return (EReference) busEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_LoadBusAssociation() {
		return (EReference) busEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBus_GeneratorBusAssociation() {
		return (EReference) busEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Bus() {
		return (EReference) lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoadBusAssociation() {
		return loadBusAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBusAssociation_Bus() {
		return (EReference) loadBusAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoadBusAssociation_Load() {
		return (EReference) loadBusAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenerator() {
		return generatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenerator_GeneratorBusAssociation() {
		return (EReference) generatorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGeneratorBusAssociation() {
		return generatorBusAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorBusAssociation_Generator() {
		return (EReference) generatorBusAssociationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGeneratorBusAssociation_Bus() {
		return (EReference) generatorBusAssociationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unifilar290922Factory getUnifilar290922Factory() {
		return (Unifilar290922Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		oneLineDiagramEClass = createEClass(ONE_LINE_DIAGRAM);
		createEReference(oneLineDiagramEClass, ONE_LINE_DIAGRAM__LOAD);
		createEReference(oneLineDiagramEClass, ONE_LINE_DIAGRAM__GENERATOR);
		createEReference(oneLineDiagramEClass, ONE_LINE_DIAGRAM__LINE);
		createEReference(oneLineDiagramEClass, ONE_LINE_DIAGRAM__BUS);

		loadEClass = createEClass(LOAD);
		createEReference(loadEClass, LOAD__LOAD_BUS_ASSOCIATION);

		busEClass = createEClass(BUS);
		createEReference(busEClass, BUS__LINE);
		createEReference(busEClass, BUS__LOAD_BUS_ASSOCIATION);
		createEReference(busEClass, BUS__GENERATOR_BUS_ASSOCIATION);

		lineEClass = createEClass(LINE);
		createEReference(lineEClass, LINE__BUS);

		loadBusAssociationEClass = createEClass(LOAD_BUS_ASSOCIATION);
		createEReference(loadBusAssociationEClass, LOAD_BUS_ASSOCIATION__BUS);
		createEReference(loadBusAssociationEClass, LOAD_BUS_ASSOCIATION__LOAD);

		generatorEClass = createEClass(GENERATOR);
		createEReference(generatorEClass, GENERATOR__GENERATOR_BUS_ASSOCIATION);

		generatorBusAssociationEClass = createEClass(GENERATOR_BUS_ASSOCIATION);
		createEReference(generatorBusAssociationEClass, GENERATOR_BUS_ASSOCIATION__GENERATOR);
		createEReference(generatorBusAssociationEClass, GENERATOR_BUS_ASSOCIATION__BUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(oneLineDiagramEClass, OneLineDiagram.class, "OneLineDiagram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOneLineDiagram_Load(), this.getLoad(), null, "load", null, 1, -1, OneLineDiagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneLineDiagram_Generator(), this.getGenerator(), null, "generator", null, 1, -1,
				OneLineDiagram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneLineDiagram_Line(), this.getLine(), null, "line", null, 1, -1, OneLineDiagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOneLineDiagram_Bus(), this.getBus(), null, "bus", null, 1, -1, OneLineDiagram.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loadEClass, Load.class, "Load", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoad_LoadBusAssociation(), this.getLoadBusAssociation(), this.getLoadBusAssociation_Load(),
				"loadBusAssociation", null, 1, 1, Load.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(busEClass, Bus.class, "Bus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBus_Line(), this.getLine(), this.getLine_Bus(), "line", null, 0, -1, Bus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getBus_LoadBusAssociation(), this.getLoadBusAssociation(), this.getLoadBusAssociation_Bus(),
				"loadBusAssociation", null, 0, -1, Bus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBus_GeneratorBusAssociation(), this.getGeneratorBusAssociation(),
				this.getGeneratorBusAssociation_Bus(), "generatorBusAssociation", null, 0, -1, Bus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLine_Bus(), this.getBus(), this.getBus_Line(), "bus", null, 2, 2, Line.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(loadBusAssociationEClass, LoadBusAssociation.class, "LoadBusAssociation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLoadBusAssociation_Bus(), this.getBus(), this.getBus_LoadBusAssociation(), "bus", null, 1, 1,
				LoadBusAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLoadBusAssociation_Load(), this.getLoad(), this.getLoad_LoadBusAssociation(), "load", null, 1,
				1, LoadBusAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorEClass, Generator.class, "Generator", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGenerator_GeneratorBusAssociation(), this.getGeneratorBusAssociation(),
				this.getGeneratorBusAssociation_Generator(), "generatorBusAssociation", null, 1, 1, Generator.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(generatorBusAssociationEClass, GeneratorBusAssociation.class, "GeneratorBusAssociation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGeneratorBusAssociation_Generator(), this.getGenerator(),
				this.getGenerator_GeneratorBusAssociation(), "generator", null, 1, 1, GeneratorBusAssociation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeneratorBusAssociation_Bus(), this.getBus(), this.getBus_GeneratorBusAssociation(), "bus",
				null, 1, 1, GeneratorBusAssociation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Unifilar290922PackageImpl
