package org.greenrobot.eventbus.b;
import java.lang.annotation.Annotation;
import org.greenrobot.eventbus.ThreadMode;

public interface abstract b implements Annotation	// class@002128
{

    int priority();
    boolean sticky();
    ThreadMode threadMode();
}
