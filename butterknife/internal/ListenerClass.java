package butterknife.internal.ListenerClass;
import java.lang.annotation.Annotation;
import java.lang.Class;
import butterknife.internal.ListenerMethod;
import java.lang.String;

public interface abstract ListenerClass implements Annotation	// class@000ba6
{

    Class callbacks();
    ListenerMethod[] method();
    String remover();
    String setter();
    String targetType();
    String type();
}
