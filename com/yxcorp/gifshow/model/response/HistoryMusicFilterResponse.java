package com.yxcorp.gifshow.model.response.HistoryMusicFilterResponse;
import java.io.Serializable;
import java.util.List;
import java.lang.Object;

public class HistoryMusicFilterResponse implements Serializable	// class@001f37
{
    public List musicFilters;
    public static final long serialVersionUID = 0xde2d5aaba82248cf;

    public void HistoryMusicFilterResponse(List p0){
       super();
       this.musicFilters = p0;
    }
}
