package org.apereo.cas.configuration.model.support.token;

import org.apereo.cas.configuration.model.core.authentication.PrincipalTransformationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * This is {@link TokenAuthenticationProperties}.
 *
 * @author Misagh Moayyed
 * @since 5.0.0
 */
public class TokenAuthenticationProperties {
    @NestedConfigurationProperty
    private PrincipalTransformationProperties principalTransformation =
            new PrincipalTransformationProperties();

    private String name;

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public PrincipalTransformationProperties getPrincipalTransformation() {
        return principalTransformation;
    }

    public void setPrincipalTransformation(final PrincipalTransformationProperties principalTransformation) {
        this.principalTransformation = principalTransformation;
    }
}
