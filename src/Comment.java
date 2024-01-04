public class Comment {
    private int postId;
    private int id;
    private String email;
    private String body;

    public Comment() {
    }

    public Comment(int postId, int id, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "postId=" + postId +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
