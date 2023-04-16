package b5c.h;
import erd.o;
import com.yxcorp.gifshow.profile.presenter.profile.page.b;
import java.lang.Object;
import java.util.Map;
import java.util.Objects;
import java.lang.String;
import a3c.a;
import com.yxcorp.gifshow.profile.state.ProfileRefreshStatus;

public final class h implements o	// class@0003ab
{
    public final b b;

    public void h(b p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       String str = a.c(p0, "profileRefreshSource");
       tb.w = str;
       if (str == null) {
          tb.w = "DEFAULT";
       }
       return a.c(p0, "MAIN_KEY");
    }
}
