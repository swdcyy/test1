package butterknife.OnTextChanged;
import java.lang.annotation.Annotation;
import butterknife.OnTextChanged$Callback;

public interface abstract OnTextChanged implements Annotation	// class@000b99
{

    OnTextChanged$Callback callback();
    int[] value();
}
