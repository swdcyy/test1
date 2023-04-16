package butterknife.internal.ListenerMethod;
import java.lang.annotation.Annotation;
import java.lang.String;

public interface abstract ListenerMethod implements Annotation	// class@000ba7
{

    String defaultReturn();
    String name();
    String[] parameters();
    String returnType();
}
