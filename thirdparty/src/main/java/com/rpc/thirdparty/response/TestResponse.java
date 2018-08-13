package com.rpc.thirdparty.response;

import java.util.List;

/**
 * @program: http
 * @description:
 * @author: Napoleon
 * @create: 2018/8/10 22:18
 * @version: 0.0.1
 **/
public class TestResponse extends Response {


    /**
     * body : {"pageNum":1,"pageSize":10,"total":3,"datas":[{"version":1,"createTime":"2018-07-04 11:20:44","creator":"admin","updateTime":"2018-07-04 11:20:44","editor":"admin","id":1,"name":"werlini","age":23,"delFlag":1},{"version":1,"createTime":"2018-07-04 11:22:49","creator":"admin","updateTime":"2018-07-04 11:22:49","editor":"admin","id":2,"name":"lixiang","age":34,"delFlag":1},{"version":1,"createTime":"2018-07-04 11:23:11","creator":"admin","updateTime":"2018-07-04 11:23:11","editor":"admin","id":3,"name":"joey","age":45,"delFlag":1}]}
     */

    private BodyBean body;

    public BodyBean getBody() {
        return body;
    }

    public void setBody(BodyBean body) {
        this.body = body;
    }

    public static class BodyBean {
        /**
         * pageNum : 1
         * pageSize : 10
         * total : 3
         * datas : [{"version":1,"createTime":"2018-07-04 11:20:44","creator":"admin","updateTime":"2018-07-04 11:20:44","editor":"admin","id":1,"name":"werlini","age":23,"delFlag":1},{"version":1,"createTime":"2018-07-04 11:22:49","creator":"admin","updateTime":"2018-07-04 11:22:49","editor":"admin","id":2,"name":"lixiang","age":34,"delFlag":1},{"version":1,"createTime":"2018-07-04 11:23:11","creator":"admin","updateTime":"2018-07-04 11:23:11","editor":"admin","id":3,"name":"joey","age":45,"delFlag":1}]
         */

        private int pageNum;
        private int pageSize;
        private int total;
        private List<DatasBean> datas;

        public int getPageNum() {
            return pageNum;
        }

        public void setPageNum(int pageNum) {
            this.pageNum = pageNum;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * version : 1
             * createTime : 2018-07-04 11:20:44
             * creator : admin
             * updateTime : 2018-07-04 11:20:44
             * editor : admin
             * id : 1
             * name : werlini
             * age : 23
             * delFlag : 1
             */

            private int version;
            private String createTime;
            private String creator;
            private String updateTime;
            private String editor;
            private int id;
            private String name;
            private int age;
            private int delFlag;

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getCreator() {
                return creator;
            }

            public void setCreator(String creator) {
                this.creator = creator;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public String getEditor() {
                return editor;
            }

            public void setEditor(String editor) {
                this.editor = editor;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }

            public int getDelFlag() {
                return delFlag;
            }

            public void setDelFlag(int delFlag) {
                this.delFlag = delFlag;
            }
        }
    }
}
