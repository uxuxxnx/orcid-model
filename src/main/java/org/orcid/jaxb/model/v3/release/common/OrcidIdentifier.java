package org.orcid.jaxb.model.v3.release.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;

@XmlRootElement(name = "orcid-identifier")
@ApiModel(value = "OrcidIdentifierV3_0")
public class OrcidIdentifier extends OrcidIdBase implements Serializable {

    private static final long serialVersionUID = 1L;

    public OrcidIdentifier() {
        super();
    }

    public OrcidIdentifier(String path) {
        super(path);
    }

    public OrcidIdentifier(OrcidIdBase other) {
        super(other);
    }

}
