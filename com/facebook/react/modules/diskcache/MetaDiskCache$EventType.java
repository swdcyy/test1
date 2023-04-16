package com.facebook.react.modules.diskcache.MetaDiskCache$EventType;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class MetaDiskCache$EventType extends Enum	// class@0012ae
{
    public static final MetaDiskCache$EventType[] $VALUES;
    public static final MetaDiskCache$EventType EVALUATE_JS_WITH_CACHE;
    public static final MetaDiskCache$EventType EVALUATE_START;
    public static final MetaDiskCache$EventType EXCEPTION;
    public static final MetaDiskCache$EventType GET_CACHE_HIT;
    public static final MetaDiskCache$EventType GET_CACHE_MISS;
    public static final MetaDiskCache$EventType GET_CACHE_NULL;
    public static final MetaDiskCache$EventType GET_DISK_CACHE_DESTROY;
    public static final MetaDiskCache$EventType GET_FINISHED;
    public static final MetaDiskCache$EventType GET_INVALID_CACHE_VERSION;
    public static final MetaDiskCache$EventType GET_INVALID_CRC;
    public static final MetaDiskCache$EventType ON_CLEARED;
    public static final MetaDiskCache$EventType ON_EVICTION;
    public static final MetaDiskCache$EventType ON_HIT;
    public static final MetaDiskCache$EventType ON_MISS;
    public static final MetaDiskCache$EventType ON_READ_EXCEPTION;
    public static final MetaDiskCache$EventType ON_WRITE_ATTEMPT;
    public static final MetaDiskCache$EventType ON_WRITE_EXCEPTION;
    public static final MetaDiskCache$EventType ON_WRITE_SUCCESS;
    public static final MetaDiskCache$EventType PUT_CACHE_UPDATED;
    public static final MetaDiskCache$EventType PUT_DISK_CACHE_DESTROY;
    public static final MetaDiskCache$EventType PUT_FINISHED;
    public static final MetaDiskCache$EventType PUT_META_VERIFY_ERROR;
    public static final MetaDiskCache$EventType PUT_RESULT_EXCEPTION;

    static {
       MetaDiskCache$EventType uEventType = new MetaDiskCache$EventType("EXCEPTION", 0);
       MetaDiskCache$EventType.EXCEPTION = uEventType;
       MetaDiskCache$EventType uEventType1 = new MetaDiskCache$EventType("EVALUATE_START", 1);
       MetaDiskCache$EventType.EVALUATE_START = uEventType1;
       MetaDiskCache$EventType uEventType2 = new MetaDiskCache$EventType("EVALUATE_JS_WITH_CACHE", 2);
       MetaDiskCache$EventType.EVALUATE_JS_WITH_CACHE = uEventType2;
       MetaDiskCache$EventType uEventType3 = new MetaDiskCache$EventType("GET_DISK_CACHE_DESTROY", 3);
       MetaDiskCache$EventType.GET_DISK_CACHE_DESTROY = uEventType3;
       MetaDiskCache$EventType uEventType4 = new MetaDiskCache$EventType("GET_CACHE_NULL", 4);
       MetaDiskCache$EventType.GET_CACHE_NULL = uEventType4;
       MetaDiskCache$EventType uEventType5 = new MetaDiskCache$EventType("GET_INVALID_CACHE_VERSION", 5);
       MetaDiskCache$EventType.GET_INVALID_CACHE_VERSION = uEventType5;
       MetaDiskCache$EventType uEventType6 = new MetaDiskCache$EventType("GET_INVALID_CRC", 6);
       MetaDiskCache$EventType.GET_INVALID_CRC = uEventType6;
       MetaDiskCache$EventType uEventType7 = new MetaDiskCache$EventType("GET_CACHE_HIT", 7);
       MetaDiskCache$EventType.GET_CACHE_HIT = uEventType7;
       MetaDiskCache$EventType uEventType8 = new MetaDiskCache$EventType("GET_CACHE_MISS", 8);
       MetaDiskCache$EventType.GET_CACHE_MISS = uEventType8;
       MetaDiskCache$EventType uEventType9 = new MetaDiskCache$EventType("GET_FINISHED", 9);
       MetaDiskCache$EventType.GET_FINISHED = uEventType9;
       MetaDiskCache$EventType uEventType10 = new MetaDiskCache$EventType("PUT_DISK_CACHE_DESTROY", 10);
       MetaDiskCache$EventType.PUT_DISK_CACHE_DESTROY = uEventType10;
       MetaDiskCache$EventType uEventType11 = new MetaDiskCache$EventType("PUT_RESULT_EXCEPTION", 11);
       MetaDiskCache$EventType.PUT_RESULT_EXCEPTION = uEventType11;
       MetaDiskCache$EventType uEventType12 = new MetaDiskCache$EventType("PUT_CACHE_UPDATED", 12);
       MetaDiskCache$EventType.PUT_CACHE_UPDATED = uEventType12;
       MetaDiskCache$EventType uEventType13 = new MetaDiskCache$EventType("PUT_META_VERIFY_ERROR", 13);
       MetaDiskCache$EventType.PUT_META_VERIFY_ERROR = uEventType13;
       MetaDiskCache$EventType uEventType14 = uEventType13;
       MetaDiskCache$EventType uEventType15 = new MetaDiskCache$EventType("PUT_FINISHED", 14);
       MetaDiskCache$EventType.PUT_FINISHED = uEventType15;
       MetaDiskCache$EventType uEventType16 = uEventType15;
       MetaDiskCache$EventType uEventType17 = new MetaDiskCache$EventType("ON_HIT", 15);
       MetaDiskCache$EventType.ON_HIT = uEventType17;
       MetaDiskCache$EventType uEventType18 = uEventType17;
       uEventType13 = new MetaDiskCache$EventType("ON_MISS", 16);
       MetaDiskCache$EventType.ON_MISS = uEventType13;
       MetaDiskCache$EventType uEventType19 = uEventType13;
       uEventType15 = new MetaDiskCache$EventType("ON_WRITE_ATTEMPT", 17);
       MetaDiskCache$EventType.ON_WRITE_ATTEMPT = uEventType15;
       MetaDiskCache$EventType uEventType20 = uEventType15;
       uEventType17 = new MetaDiskCache$EventType("ON_WRITE_SUCCESS", 18);
       MetaDiskCache$EventType.ON_WRITE_SUCCESS = uEventType17;
       MetaDiskCache$EventType uEventType21 = uEventType17;
       uEventType13 = new MetaDiskCache$EventType("ON_READ_EXCEPTION", 19);
       MetaDiskCache$EventType.ON_READ_EXCEPTION = uEventType13;
       MetaDiskCache$EventType uEventType22 = uEventType13;
       uEventType15 = new MetaDiskCache$EventType("ON_WRITE_EXCEPTION", 20);
       MetaDiskCache$EventType.ON_WRITE_EXCEPTION = uEventType15;
       MetaDiskCache$EventType uEventType23 = uEventType15;
       uEventType17 = new MetaDiskCache$EventType("ON_EVICTION", 21);
       MetaDiskCache$EventType.ON_EVICTION = uEventType17;
       MetaDiskCache$EventType uEventType24 = uEventType17;
       uEventType13 = new MetaDiskCache$EventType("ON_CLEARED", 22);
       MetaDiskCache$EventType.ON_CLEARED = uEventType13;
       MetaDiskCache$EventType[] uEventTypeAr = new MetaDiskCache$EventType[23];
       uEventTypeAr[0] = uEventType;
       uEventTypeAr[1] = uEventType1;
       uEventTypeAr[2] = uEventType2;
       uEventTypeAr[3] = uEventType3;
       uEventTypeAr[4] = uEventType4;
       uEventTypeAr[5] = uEventType5;
       uEventTypeAr[6] = uEventType6;
       uEventTypeAr[7] = uEventType7;
       uEventTypeAr[8] = uEventType8;
       uEventTypeAr[9] = uEventType9;
       uEventTypeAr[10] = uEventType10;
       uEventTypeAr[11] = uEventType11;
       uEventTypeAr[12] = uEventType12;
       uEventTypeAr[13] = uEventType14;
       uEventTypeAr[14] = uEventType16;
       uEventTypeAr[15] = uEventType18;
       uEventTypeAr[16] = uEventType19;
       uEventTypeAr[17] = uEventType20;
       uEventTypeAr[18] = uEventType21;
       uEventTypeAr[19] = uEventType22;
       uEventTypeAr[20] = uEventType23;
       uEventTypeAr[21] = uEventType24;
       uEventTypeAr[22] = uEventType13;
       MetaDiskCache$EventType.$VALUES = uEventTypeAr;
    }
    public void MetaDiskCache$EventType(String p0,int p1){
       super(p0, p1);
    }
    public static MetaDiskCache$EventType valueOf(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, MetaDiskCache$EventType.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(MetaDiskCache$EventType.class, p0);
    }
    public static MetaDiskCache$EventType[] values(){
       Object obj = PatchProxy.apply(null, null, MetaDiskCache$EventType.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return MetaDiskCache$EventType.$VALUES.clone();
    }
}
