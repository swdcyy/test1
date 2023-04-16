package com.kwai.live.gzone.tab.rank.a;
import erd.g;
import com.kwai.live.gzone.tab.rank.LiveGzoneAudienceRankTabPresenter;
import java.lang.Object;
import com.trello.rxlifecycle3.android.FragmentEvent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import y43.a;
import m02.o;
import h63.i;

public class a implements g	// class@000e24
{
    public final LiveGzoneAudienceRankTabPresenter b;

    public void a(LiveGzoneAudienceRankTabPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
       }else if(p0 == FragmentEvent.RESUME && this.b.t.E.a()){
          this.b.C.c();
       }else if(p0 == FragmentEvent.PAUSE){
          this.b.C.b();
       }
       return;
    }
}
