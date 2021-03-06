package org.apereo.cas.support.openid.authentication.principal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apereo.cas.authentication.principal.AbstractWebApplicationService;
import org.apereo.cas.authentication.principal.ResponseBuilder;
import org.apereo.cas.authentication.principal.WebApplicationService;

/**
 * @author Scott Battaglia
 * @since 3.1
 */
public class OpenIdService extends AbstractWebApplicationService {

    private static final long serialVersionUID = 5776500133123291301L;

    private String identity;

    /**
     * Instantiates a new OpenID service.
     *
     * @param id              the id
     * @param originalUrl     the original url
     * @param artifactId      the artifact id
     * @param identity        the OpenID identity
     * @param responseBuilder the response builder
     */

    @JsonCreator
    protected OpenIdService(@JsonProperty("id") final String id, @JsonProperty("originalUrl") final String originalUrl,
                            @JsonProperty("artifactId") final String artifactId,
                            @JsonProperty("identity") final String identity,
                            @JsonProperty("responseBuilder") final ResponseBuilder<WebApplicationService> responseBuilder) {
        super(id, originalUrl, artifactId, responseBuilder);
        this.identity = identity;
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(this.identity)
                .toHashCode();
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (!super.equals(obj)) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final OpenIdService other = (OpenIdService) obj;
        if (this.identity == null) {
            if (other.identity != null) {
                return false;
            }
        } else if (!this.identity.equals(other.identity)) {
            return false;
        }
        return true;
    }

    public String getIdentity() {
        return this.identity;
    }
}
