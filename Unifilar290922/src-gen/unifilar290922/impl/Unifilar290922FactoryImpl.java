/**
 */
package unifilar290922.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import unifilar290922.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Unifilar290922FactoryImpl extends EFactoryImpl implements Unifilar290922Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Unifilar290922Factory init() {
		try {
			Unifilar290922Factory theUnifilar290922Factory = (Unifilar290922Factory) EPackage.Registry.INSTANCE
					.getEFactory(Unifilar290922Package.eNS_URI);
			if (theUnifilar290922Factory != null) {
				return theUnifilar290922Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Unifilar290922FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unifilar290922FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Unifilar290922Package.ONE_LINE_DIAGRAM:
			return createOneLineDiagram();
		case Unifilar290922Package.LOAD:
			return createLoad();
		case Unifilar290922Package.BUS:
			return createBus();
		case Unifilar290922Package.LINE:
			return createLine();
		case Unifilar290922Package.LOAD_BUS_ASSOCIATION:
			return createLoadBusAssociation();
		case Unifilar290922Package.GENERATOR:
			return createGenerator();
		case Unifilar290922Package.GENERATOR_BUS_ASSOCIATION:
			return createGeneratorBusAssociation();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OneLineDiagram createOneLineDiagram() {
		OneLineDiagramImpl oneLineDiagram = new OneLineDiagramImpl();
		return oneLineDiagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Load createLoad() {
		LoadImpl load = new LoadImpl();
		return load;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bus createBus() {
		BusImpl bus = new BusImpl();
		return bus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBusAssociation createLoadBusAssociation() {
		LoadBusAssociationImpl loadBusAssociation = new LoadBusAssociationImpl();
		return loadBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Generator createGenerator() {
		GeneratorImpl generator = new GeneratorImpl();
		return generator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneratorBusAssociation createGeneratorBusAssociation() {
		GeneratorBusAssociationImpl generatorBusAssociation = new GeneratorBusAssociationImpl();
		return generatorBusAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Unifilar290922Package getUnifilar290922Package() {
		return (Unifilar290922Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Unifilar290922Package getPackage() {
		return Unifilar290922Package.eINSTANCE;
	}

} //Unifilar290922FactoryImpl
