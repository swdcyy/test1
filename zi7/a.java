package zi7.a;
import zi7.a$a;
import java.util.List;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureDetails;
import java.lang.String;
import com.kwai.plugin.dva.feature.core.repository.config.FeatureInfo;
import com.kwai.plugin.dva.feature.core.repository.SplitSourceProvider;

public interface abstract a	// class@00293e
{
    public static final a$a a;

    static {
       a.a = a$a.a;
    }
    List a();
    boolean b();
    void c(boolean p0);
    FeatureDetails d();
    int e();
    FeatureInfo f(String p0);
    SplitSourceProvider g();
    FeatureDetails h();
}
