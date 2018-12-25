package cn.edu.nju.software.storymapping.map.entity;

import java.util.Date;
import java.util.List;

public class Release {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.description
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.creator_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer creatorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.create_time
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.story_map_id
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private Integer storyMapId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.order
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private String order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column release.name
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    private String name;
    private List<SubTaskCard> subTaskCardList;


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Release(Integer id, String description, Integer creatorId, Date createTime, Integer storyMapId, String order, String name) {
        this.id = id;
        this.description = description;
        this.creatorId = creatorId;
        this.createTime = createTime;
        this.storyMapId = storyMapId;
        this.order = order;
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table release
     *
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Release() {
        super();
    }

    public List<SubTaskCard> getSubTaskCardList() {
        return subTaskCardList;
    }

    public void setSubTaskCardList(List<SubTaskCard> subTaskCardList) {
        this.subTaskCardList = subTaskCardList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.id
     *
     * @return the value of release.id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.id
     *
     * @param id the value for release.id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.description
     *
     * @return the value of release.description
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.description
     *
     * @param description the value for release.description
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.creator_id
     *
     * @return the value of release.creator_id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Integer getCreatorId() {
        return creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.creator_id
     *
     * @param creatorId the value for release.creator_id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.create_time
     *
     * @return the value of release.create_time
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.create_time
     *
     * @param createTime the value for release.create_time
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.story_map_id
     *
     * @return the value of release.story_map_id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public Integer getStoryMapId() {
        return storyMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.story_map_id
     *
     * @param storyMapId the value for release.story_map_id
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setStoryMapId(Integer storyMapId) {
        this.storyMapId = storyMapId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.order
     *
     * @return the value of release.order
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public String getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.order
     *
     * @param order the value for release.order
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setOrder(String order) {
        this.order = order == null ? null : order.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column release.name
     *
     * @return the value of release.name
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column release.name
     *
     * @param name the value for release.name
     * @mbg.generated Sat Dec 22 16:48:12 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}