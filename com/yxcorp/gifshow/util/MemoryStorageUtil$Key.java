package com.yxcorp.gifshow.util.MemoryStorageUtil$Key;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class MemoryStorageUtil$Key extends Enum	// class@001efa
{
    public static final MemoryStorageUtil$Key[] $VALUES;
    public static final MemoryStorageUtil$Key EFollowChanged;
    public static final MemoryStorageUtil$Key EHasViewUnreadMessagePage;
    public static final MemoryStorageUtil$Key EMessageSummaryChanged;
    public static final MemoryStorageUtil$Key ENumberLike;
    public static final MemoryStorageUtil$Key EUserFollowChanged;
    public static final MemoryStorageUtil$Key EUserInfoChanged;
    public static final MemoryStorageUtil$Key FollowStoryKeep;

    static {
       MemoryStorageUtil$Key key = new MemoryStorageUtil$Key("EUserInfoChanged", 0);
       MemoryStorageUtil$Key.EUserInfoChanged = key;
       MemoryStorageUtil$Key key1 = new MemoryStorageUtil$Key("EFollowChanged", 1);
       MemoryStorageUtil$Key.EFollowChanged = key1;
       MemoryStorageUtil$Key key2 = new MemoryStorageUtil$Key("ENumberLike", 2);
       MemoryStorageUtil$Key.ENumberLike = key2;
       MemoryStorageUtil$Key key3 = new MemoryStorageUtil$Key("EMessageSummaryChanged", 3);
       MemoryStorageUtil$Key.EMessageSummaryChanged = key3;
       MemoryStorageUtil$Key key4 = new MemoryStorageUtil$Key("EHasViewUnreadMessagePage", 4);
       MemoryStorageUtil$Key.EHasViewUnreadMessagePage = key4;
       MemoryStorageUtil$Key key5 = new MemoryStorageUtil$Key("FollowStoryKeep", 5);
       MemoryStorageUtil$Key.FollowStoryKeep = key5;
       MemoryStorageUtil$Key key6 = new MemoryStorageUtil$Key("EUserFollowChanged", 6);
       MemoryStorageUtil$Key.EUserFollowChanged = key6;
       MemoryStorageUtil$Key[] keyArray = new MemoryStorageUtil$Key[]{key,key1,key2,key3,key4,key5,key6};
       MemoryStorageUtil$Key.$VALUES = keyArray;
    }
    public void MemoryStorageUtil$Key(String p0,int p1){
       super(p0, p1);
    }
    public static MemoryStorageUtil$Key valueOf(String p0){
       return Enum.valueOf(MemoryStorageUtil$Key.class, p0);
    }
    public static MemoryStorageUtil$Key[] values(){
       return MemoryStorageUtil$Key.$VALUES.clone();
    }
}
