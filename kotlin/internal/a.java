package kotlin.internal.a;
import java.lang.annotation.Annotation;
import kotlin.DeprecationLevel;
import java.lang.String;
import kotlin.internal.RequireKotlinVersionKind;

public interface abstract a implements Annotation	// class@00187a
{

    int errorCode();
    DeprecationLevel level();
    String message();
    String version();
    RequireKotlinVersionKind versionKind();
}
