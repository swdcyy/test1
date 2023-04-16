package bm5.d;
import bm5.d$a;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.model.CDNUrl;
import k2b.e0;
import com.yxcorp.gifshow.entity.QPhoto;
import wx6.d;

public final class d	// class@0004e7
{
    public QPhoto a;
    public String b;
    public e0 c;
    public String d;
    public BaseFragment e;
    public d f;
    public CDNUrl[] g;
    public boolean h;
    public boolean i;
    public final PublishSubject j;

    public void d(d$a p0){
       super();
       this.a = p0.c;
       this.b = p0.f;
       this.c = p0.e;
       this.d = p0.b;
       this.e = p0.d;
       this.f = p0.a;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       PublishSubject publishSubje = PublishSubject.g();
       a.o(publishSubje, "PublishSubject.create<String>\(\)");
       this.j = publishSubje;
    }
    public final BaseFragment a(){
       return this.e;
    }
    public final boolean b(){
       return this.h;
    }
    public final CDNUrl[] c(){
       return this.g;
    }
    public final e0 d(){
       return this.c;
    }
    public final PublishSubject e(){
       return this.j;
    }
    public final QPhoto f(){
       return this.a;
    }
    public final String g(){
       return this.b;
    }
    public final d h(){
       return this.f;
    }
    public final boolean i(){
       return this.i;
    }
    public final String j(){
       return this.d;
    }
    public final void k(QPhoto p0){
       this.a = p0;
    }
}
