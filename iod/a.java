package iod.a;
import androidx.lifecycle.ViewModel;
import ynd.e;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.MutableLiveData;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleValue;
import nsd.u;
import com.yxcorp.gifshow.v3.editor.text.model.TextStyleAttrs;
import java.util.List;
import mn9.b;
import ynd.c;
import ynd.a;

public final class a extends ViewModel	// class@0014f8
{
    public final MutableLiveData a;
    public final MutableLiveData b;
    public final MutableLiveData c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public c f;
    public c g;
    public c h;
    public View$OnClickListener i;
    public a j;
    public final b k;
    public final b l;
    public final e m;

    public void a(e p0){
       a.p(p0, "dataOption");
       super();
       this.m = p0;
       this.a = new MutableLiveData(Boolean.TRUE);
       this.b = new MutableLiveData(null);
       this.c = new MutableLiveData(null);
       TextStyleValue textStyleVal = new TextStyleValue(0, null, null, null, null, 0, null, false, 255, null);
       this.d = new MutableLiveData(v12);
       TextStyleAttrs textStyleAtt = new TextStyleAttrs(0, false, false, null, 15, null);
       this.e = new MutableLiveData(v8);
       this.k = p0.b();
       this.l = p0.a();
    }
    public final MutableLiveData o0(){
       return this.a;
    }
    public final c p0(){
       return this.h;
    }
    public final a q0(){
       return this.j;
    }
    public final c r0(){
       return this.f;
    }
    public final MutableLiveData s0(){
       return this.d;
    }
    public final MutableLiveData t0(){
       return this.c;
    }
    public final MutableLiveData u0(){
       return this.b;
    }
    public final MutableLiveData v0(){
       return this.e;
    }
    public final b w0(){
       return this.k;
    }
}
