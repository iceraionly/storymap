package cn.edu.nju.software.storymapping.map.entity;

import java.util.List;

public class Role {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.name
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.image_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer imageId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.description
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column role.story_map_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer storyMapId;

    private List<ActivityCard> activityCardList;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Role(Integer id, String name, Integer imageId, String description, Integer storyMapId) {
        this.id = id;
        this.name = name;
        this.imageId = imageId;
        this.description = description;
        this.storyMapId = storyMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table role
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Role() {
        super();
    }

    public List<ActivityCard> getActivityCardList() {
        return activityCardList;
    }

    public void setActivityCardList(List<ActivityCard> activityCardList) {
        this.activityCardList = activityCardList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.id
     *
     * @return the value of role.id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */

    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.id
     *
     * @param id the value for role.id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.name
     *
     * @return the value of role.name
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.name
     *
     * @param name the value for role.name
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.image_id
     *
     * @return the value of role.image_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Integer getImageId() {
        return imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.image_id
     *
     * @param imageId the value for role.image_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setImageId(Integer imageId) {
        this.imageId = imageId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.description
     *
     * @return the value of role.description
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.description
     *
     * @param description the value for role.description
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column role.story_map_id
     *
     * @return the value of role.story_map_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Integer getStoryMapId() {
        return storyMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column role.story_map_id
     *
     * @param storyMapId the value for role.story_map_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setStoryMapId(Integer storyMapId) {
        this.storyMapId = storyMapId;
    }
}