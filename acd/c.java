package acd.c;
import com.yxcorp.plugin.search.module.ModuleConfig;
import java.lang.String;
import android.view.View;
import acd.g;
import com.yxcorp.plugin.search.module.ModuleResponse;

public interface abstract c	// class@0000cd
{

    boolean A();
    boolean g();
    ModuleConfig getConfig();
    String getLogName();
    int getModuleId();
    String getTitle();
    View getView();
    int h();
    int j();
    boolean k();
    void m(g p0);
    void onCreate();
    void onDestroy();
    void q();
    void r(ModuleResponse p0);
    void s(ModuleResponse p0);
    void v(boolean p0);
    View y();
    void z(g p0);
}
