package com.google.protobuf.nano.MapFactories;
import com.google.protobuf.nano.MapFactories$DefaultMapFactory;
import com.google.protobuf.nano.MapFactories$1;
import java.lang.Object;
import com.google.protobuf.nano.MapFactories$MapFactory;

public final class MapFactories	// class@000518
{
    public static MapFactories$MapFactory mapFactory;

    static {
       MapFactories.mapFactory = new MapFactories$DefaultMapFactory(null);
    }
    public void MapFactories(){
       super();
    }
    public static MapFactories$MapFactory getMapFactory(){
       return MapFactories.mapFactory;
    }
    public static void setMapFactory(MapFactories$MapFactory p0){
       MapFactories.mapFactory = p0;
    }
}
