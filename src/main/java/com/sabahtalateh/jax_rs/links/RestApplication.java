package com.sabahtalateh.jax_rs.links;

import com.sabahtalateh.jax_rs.links.resources.LinkResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();
        classes.add(LinkResource.class);

        return classes;
    }
}
