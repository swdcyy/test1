package butterknife.OnPageChange;
import java.lang.annotation.Annotation;
import butterknife.OnPageChange$Callback;

public interface abstract OnPageChange implements Annotation	// class@000b97
{

    OnPageChange$Callback callback();
    int[] value();
}
