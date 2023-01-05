package com.hippo.ehviewer.dao;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

import com.hippo.ehviewer.client.data.GalleryInfo;

@Entity(tableName = "HISTORY")
public class HistoryInfo extends GalleryInfo {
    @ColumnInfo(name = "TIME")
    public long time;
    // Use MODE for favoriteSlot
    @ColumnInfo(name = "MODE")
    private int mode;

    public HistoryInfo(GalleryInfo galleryInfo) {
        this.gid = galleryInfo.gid;
        this.token = galleryInfo.token;
        this.title = galleryInfo.title;
        this.titleJpn = galleryInfo.titleJpn;
        this.thumb = galleryInfo.thumb;
        this.category = galleryInfo.category;
        this.posted = galleryInfo.posted;
        this.uploader = galleryInfo.uploader;
        this.rating = galleryInfo.rating;
        this.simpleTags = galleryInfo.simpleTags;
        this.simpleLanguage = galleryInfo.simpleLanguage;
        this.favoriteSlot = galleryInfo.favoriteSlot;
    }

    public HistoryInfo(int mode, long time) {
        this.favoriteSlot = mode - 2;
        this.time = time;
    }

    public long getGid() {
        return gid;
    }

    public void setGid(long gid) {
        this.gid = gid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitleJpn() {
        return titleJpn;
    }

    public void setTitleJpn(String titleJpn) {
        this.titleJpn = titleJpn;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getSimpleLanguage() {
        return simpleLanguage;
    }

    public void setSimpleLanguage(String simpleLanguage) {
        this.simpleLanguage = simpleLanguage;
    }

    public int getMode() {
        return favoriteSlot + 2;
    }

    public void setMode(int mode) {
        this.favoriteSlot = mode - 2;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
