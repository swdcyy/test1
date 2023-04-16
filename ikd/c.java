package ikd.c;
import java.lang.Integer;
import com.smile.gifshow.annotation.plugin.Factory;

public interface abstract c	// class@001802
{

    Factory createImpl(Integer p0);
    Factory createPlugin(Integer p0);
    Factory createSingleton(Integer p0);
    void preloadClass();
    void preloadInstance();
}
