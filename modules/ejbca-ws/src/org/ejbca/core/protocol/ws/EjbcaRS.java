package org.ejbca.core.protocol.ws;

import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;
@ApplicationPath("/")
public class EjbcaRS extends javax.ws.rs.core.Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set classes = new HashSet<>();
        classes.add(EjbcaWS.class);
        return classes;
    }

}
