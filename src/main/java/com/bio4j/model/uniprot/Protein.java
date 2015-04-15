package com.bio4j.model.uniprot;

import com.bio4j.examples.json.model.go.GOTerm;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by ppareja on 3/26/2015.
 */
public class Protein {

	public String accession;
	public String name;
	public String shortName;
	public String fullName;
	public List<String> geneNames;
	public List<GOTerm> annotatedByGOTerms;

	public List<GOTerm> getAnnotatedByGOTerms() {
		return annotatedByGOTerms;
	}

	public Protein(){

	}

	public Protein(com.bio4j.model.uniprot.vertices.Protein protein){
		this.accession = protein.accession();
		this.name = protein.name();
		this.shortName = protein.shortName();
		this.fullName = protein.fullName();
	}

	public void setAnnotatedByGOTerms(List<GOTerm> annotatedByGOTerms) {
		this.annotatedByGOTerms = annotatedByGOTerms;
	}

	public void addAnnotatedByGOTerm(GOTerm term){
		if(annotatedByGOTerms == null){
			annotatedByGOTerms = new LinkedList<>();
		}
		annotatedByGOTerms.add(term);
	}

	public List<String> getGeneNames() {
		return geneNames;
	}

	public void setGeneNames(List<String> geneNames) {
		this.geneNames = geneNames;
	}

	public String getAccession() {
		return accession;
	}

	public void setAccession(String accession) {
		this.accession = accession;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public List<String> getGeneLocations() {
		return geneLocations;
	}

	public void setGeneLocations(List<String> geneLocations) {
		this.geneLocations = geneLocations;
	}

	public List<String> geneLocations;
}
