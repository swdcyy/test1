package com.trello.rxlifecycle3.a$a;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.trello.rxlifecycle3.OutsideLifecycleException;
import java.lang.Boolean;
import java.lang.RuntimeException;
import drd.a;

public final class a$a implements o	// class@000fda
{

    public void a$a(){
       super();
    }
    public Object apply(Object p0){
       if (p0 instanceof OutsideLifecycleException) {
          return Boolean.TRUE;
       }
       a.a(p0);
       throw null;
    }
}
