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
        "channel":"CBR2V3XEX",
            "attachments": [
        {
            "fallback":"Plain-text summary of the attachment.",
                "color":"#2eb886",
                "pretext":"Optional text that appears above the attachment block",
                "author_name":"Bobby Tables",
                "author_link":"http://flickr.com/bobby/",
                "author_icon":"http://flickr.com/icons/bobby.jpg",
                "title":"Slack API Documentation",
                "title_link":"https://api.slack.com/",
                "text":"Optional text that appears within the attachment",
                "fields": [
            {
                "title":"Priority",
                    "value":"High",
                    "short":false
            }
              ],
            "image_url":"http://my-website.com/path/to/image.jpg",
                "thumb_url":"http://example.com/path/to/thumb.png",
                "footer":"Slack API",
                "footer_icon":"https://platform.slack-edge.com/img/default_application_icon.png",
                "ts":123456789
        }
      ]
    }

}

    public Attachment(JSONObject json) {
        // TODO: parse an attachment from the incoming json
    }

    // TODO add getters to access private fields



}
