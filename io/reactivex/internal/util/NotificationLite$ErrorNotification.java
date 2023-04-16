package io.reactivex.internal.util.NotificationLite$ErrorNotification;
import java.io.Serializable;
import java.lang.Throwable;
import java.lang.Object;
import io.reactivex.internal.functions.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class NotificationLite$ErrorNotification implements Serializable	// class@0014ce
{
    public final Throwable e;
    public static final long serialVersionUID = 0x866e4d1b357005eb;

    public void NotificationLite$ErrorNotification(Throwable p0){
       super();
       this.e = p0;
    }
    public boolean equals(Object p0){
       if (p0 instanceof NotificationLite$ErrorNotification) {
          return a.a(this.e, p0.e);
       }
       return false;
    }
    public int hashCode(){
       return this.e.hashCode();
    }
    public String toString(){
       return "NotificationLite.Error["+this.e+"]";
    }
}
