package org.orcid.jaxb.model.record.summary_rc2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_rc2.LastModifiedDate;
import org.orcid.jaxb.model.record_rc2.Group;
import org.orcid.jaxb.model.record_rc2.GroupsContainer;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "lastModifiedDate", "workGroup" })
@XmlRootElement(name = "works", namespace = "http://www.orcid.org/ns/activities")
public class Works implements GroupsContainer, Serializable {

    private static final long serialVersionUID = 3293976926416154039L;
    @XmlElement(name = "last-modified-date", namespace = "http://www.orcid.org/ns/common")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(name = "group", namespace = "http://www.orcid.org/ns/activities")
    private List<WorkGroup> workGroup;

    public List<WorkGroup> getWorkGroup() {
        if (workGroup == null) {
            workGroup = new ArrayList<WorkGroup>();
        }
        return workGroup;
    }

    @Override
    public Collection<? extends Group> retrieveGroups() {
        return getWorkGroup();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((workGroup == null) ? 0 : workGroup.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Works other = (Works) obj;
        if (workGroup == null) {
            if (other.workGroup != null)
                return false;
        } else if (!workGroup.equals(other.workGroup))
            return false;
        return true;
    }

    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(LastModifiedDate lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}