package com.kuaishou.tuna_core.multi_web_page.model.a;
import com.kuaishou.tuna_core.multi_web_page.model.TunaMultiWebConfigInfo;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;

public class a	// class@0010f1
{
    public TunaMultiWebConfigInfo a;
    public final PublishSubject b;
    public final PublishSubject c;

    public void a(TunaMultiWebConfigInfo p0){
       super();
       this.b = PublishSubject.g();
       this.c = PublishSubject.g();
       this.a = p0;
    }
}
