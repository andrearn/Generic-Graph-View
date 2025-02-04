/**
 */
package org.eclipse.xtext.graphview.style.graphViewStyle;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.graphview.map.graphViewMapping.DiagramMapping;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Sheet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getImportSection <em>Import Section</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getDiagramMapping <em>Diagram Mapping</em>}</li>
 *   <li>{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getStyles <em>Styles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyleSheet()
 * @model
 * @generated
 */
public interface StyleSheet extends EObject
{
	/**
	 * Returns the value of the '<em><b>Import Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Section</em>' containment reference.
	 * @see #setImportSection(XImportSection)
	 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyleSheet_ImportSection()
	 * @model containment="true"
	 * @generated
	 */
	XImportSection getImportSection();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getImportSection <em>Import Section</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Section</em>' containment reference.
	 * @see #getImportSection()
	 * @generated
	 */
	void setImportSection(XImportSection value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyleSheet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Diagram Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Mapping</em>' reference.
	 * @see #setDiagramMapping(DiagramMapping)
	 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyleSheet_DiagramMapping()
	 * @model
	 * @generated
	 */
	DiagramMapping getDiagramMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.xtext.graphview.style.graphViewStyle.StyleSheet#getDiagramMapping <em>Diagram Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Mapping</em>' reference.
	 * @see #getDiagramMapping()
	 * @generated
	 */
	void setDiagramMapping(DiagramMapping value);

	/**
	 * Returns the value of the '<em><b>Styles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.xtext.graphview.style.graphViewStyle.Style}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styles</em>' containment reference list.
	 * @see org.eclipse.xtext.graphview.style.graphViewStyle.GraphViewStylePackage#getStyleSheet_Styles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Style> getStyles();

} // StyleSheet
