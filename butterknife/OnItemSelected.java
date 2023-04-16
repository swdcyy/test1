package butterknife.OnItemSelected;
import java.lang.annotation.Annotation;
import butterknife.OnItemSelected$Callback;

public interface abstract OnItemSelected implements Annotation	// class@000b94
{

    OnItemSelected$Callback callback();
    int[] value();
}
