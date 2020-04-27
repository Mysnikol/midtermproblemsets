package com.floreo.bbah.model;

import de.ralleytn.simple.json.JSONObject;

/**
 *
 * A class representing a message attachment.
 * See https://api.slack.com/docs/message-attachments
 *
 */

public class Attachment {

    // TODO: implement private fields for each of the following attachment JSON keys:

    // Mysnikol added generic code until she figures out what ACTUALLY needs to be entered
    {
        private String Channel; //"Channel":"CBR2V3XEX",
            private Object attachments; //"attachments":
           [
        {
            private String fallback; //"fallback":"Plain-text summary of the attachment.",
            private String color; //"color":"#2eb886",
            private String pretext; //"pretext":"Optional text that appears above the attachment block",
            private String authorName; //"author_name":"Bobby Tables",
            private String authorLink; //"author_link":"http://flickr.com/bobby/",
            private String authorIcon; //"author_icon":"http://flickr.com/icons/bobby.jpg",
            private String title; //"title":"Slack API Documentation",
            private String titleLink; //"title_link":"https://api.slack.com/",
            private String text; //"text":"Optional text that appears within the attachment",
            private Object fields; //"fields":
             [
            {
                private String title; //"title":"Priority",
                private String value; //"value":"High",
                private Boolean short; //"short":false
            }
              ],
            private String imageUrl; //"image_url":"http://my-website.com/path/to/image.jpg",
            private String thumbUrl; //"thumb_url":"http://example.com/path/to/thumb.png",
            private String footer; //"footer":"Slack API",
            private String footerIcon; //"footer_icon":"https://platform.slack-edge.com/img/default_application_icon.png",
            private String ts; //"ts":123456789
        }
      ]
    }

}

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
    }
    if (json.get("Channel") !=null){
            this.Channel=(String)json.get(Channel);
            }

            if (json.get("attachments") !=null){
            this.attachments=(String)json.get(attachments);
            }

    if (json.get("fallback") !=null){
                this.Channel=(String)json.get(fallback);
                }

        if (json.get("color") !=null){
                this.color=(String)json.get(color);
                }

        if (json.get("pretext") !=null){
                this.pretext=(String)json.get(pretext);
                }

        if (json.get("author_name") !=null){
                this.author_name=(String)json.get(author_name);
                }

                if (json.get("author_link") !=null){
                this.author_link=(String)json.get(author_link);
                }

                if (json.get("author_icon") !=null){
                this.author_icon=(String)json.get(author_icon);
                }

                if (json.get("title") !=null){
                this.title =(String)json.get(title);
                }

                if (json.get("titleLink") !=null){
                this.titleLink=(String)json.get(titleLink);
                }

                if (json.get("text") !=null){
                this.text=(String)json.get(text);
                }

                if (json.get("fields") !=null){
                this.fields=(String)json.get(fields);
                }

                if (json.get("imageUrl") !=null){
                this.imageUrl=(String)json.get(imageUrl);
                }

                if (json.get("thumbUrl") !=null){
                this.thumbUrl=(String)json.get(thumbUrl);
                }

                if (json.get("footer") !=null){
                this.footer=(String)json.get(footer);
                }
                if (json.get("footerIcon") !=null){
                this.footerIcon=(String)json.get(footerIcon);
                }

                if (json.get("ts") !=null){
                this.ts=(String)json.get(ts);
                }

    // TODO add getters to access private fields

public String getChannel() {
        return Channel;
        }

public String getAttachments() {
        return id;
        }

public String getFallback() {
        return fallback;
        }

public String getColor() {
        return color;
        }

public String getPretext() {
        return pretext;
        }

public String getAuthorName() {
        return authorName;
        }

public String getAuthorLink() {
        return authorLink;
        }

public String getAuthorIcon() {
        return authorIcon;
        }

public String getTitle() {
        return title;
        }

public String getTitleLink() {
        return titleLink;
        }

public String getText() {
        return text;
        }

public Object getFields() {
        return fields;
        }

public String getTitle() {
        return title;
        }

public String getValue() {
        return value;
        }

public Boolean getShort() {
        return short;
        }

public String getImageUrl() {
        return imageUrl;
        }

public String getThumbUrl() {
        return thumbUrl;
        }

public String getFooter() {
        return footer;
        }

public String getFooterIcon() {
        return footerIcon;
        }

public String getTs() {
        return ts;
        }

}
