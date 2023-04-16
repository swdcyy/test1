package kotlin.RequiresOptIn;
import java.lang.annotation.Annotation;
import kotlin.RequiresOptIn$Level;
import java.lang.String;

public interface abstract RequiresOptIn implements Annotation	// class@001815
{

    RequiresOptIn$Level level();
    String message();
}
