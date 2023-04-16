package vsd.c;
import vsd.b;
import java.lang.Object;
import java.util.Map;
import java.lang.String;
import java.util.List;
import vsd.r;
import kotlin.reflect.KVisibility;

public interface abstract c implements b	// class@0026e0
{

    Object call(Object[] p0);
    Object callBy(Map p0);
    String getName();
    List getParameters();
    r getReturnType();
    List getTypeParameters();
    KVisibility getVisibility();
    boolean isAbstract();
    boolean isFinal();
    boolean isOpen();
    boolean isSuspend();
}
