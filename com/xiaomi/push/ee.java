package com.xiaomi.push.ee;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ee extends Enum	// class@001101
{
    public String a;
    public static final ee a;
    public static final ee[] a;
    public static final ee b;
    public static final ee c;
    public static final ee d;

    static {
       ee uoee = new ee("ACTIVITY", 0, "activity");
       ee.a = uoee;
       ee uoee1 = new ee("SERVICE_ACTION", 1, "service_action");
       ee.b = uoee1;
       ee uoee2 = new ee("SERVICE_COMPONENT", 2, "service_component");
       ee.c = uoee2;
       ee uoee3 = new ee("PROVIDER", 3, "provider");
       ee.d = uoee3;
       ee[] uoeeArray = new ee[]{uoee,uoee1,uoee2,uoee3};
       ee.a = uoeeArray;
    }
    public void ee(String p0,int p1,String p2){
       this.a = p2;
    }
    public static ee valueOf(String p0){
       return Enum.valueOf(ee.class, p0);
    }
    public static ee[] values(){
       return ee.a.clone();
    }
}
