//Jak Sum William Tong
//S1823550

package org.me.gcu.tong_william_s1823550;

public class Roadwork {
    private String title;
    private String description;
    private String position;

    public Roadwork() {
        title = "";
        description = "";
        position = "";
    }

    public Roadwork(String atitle, String adescription, String aposition) {
        title = atitle;
        description = adescription;
        position = aposition;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPosition() {return position;}

    public void setTitle(String atitle) {
        title = atitle;
    }

    public void setDescription(String adescription) {
        description = adescription;
    }

    public void setPosition(String aposition){
        position = aposition;
    }

    public String toString() {
        String temp;
        temp = title + "\n" + description + "\n" + position;
        return temp;
    }
}

