package com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource;
import rx6.b;
import com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$a;
import nsd.u;
import msd.a;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import rx6.a;
import com.kwai.video.wayne.player.main.IWaynePlayer;
import com.kwai.video.wayne.player.builder.WayneBuildData;
import com.kwai.library.kwaiplayerkit.framework.datasource.LocalResDataSource$attachTo$1;
import com.kwai.video.player.misc.IMediaDataSource;

public final class LocalResDataSource implements b	// class@000871
{
    public final a a;
    public final String b;
    public static final LocalResDataSource$a c;

    static {
       LocalResDataSource.c = new LocalResDataSource$a(null);
    }
    public void LocalResDataSource(a p0){
       super(p0, p0.toString());
    }
    public void LocalResDataSource(a p0,String p1){
       a.p(p0, "streamProvider");
       a.p(p1, "resId");
       super();
       this.a = p0;
       this.b = p1;
    }
    public boolean a(){
       return a.a(this);
    }
    public void b(IWaynePlayer p0){
       a.c(this, p0);
    }
    public void c(WayneBuildData p0){
       a.p(p0, "playerBuildData");
       p0.setMediaDataSource(new LocalResDataSource$attachTo$1(this));
    }
    public boolean d(){
       return a.b(this);
    }
}
