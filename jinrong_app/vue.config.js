module.exports={
    devServer:{
        host:'localhost',
        port:'8081',
        proxy:{
            "/api":{
                target:'http://localhost:8088/jinrong_api/',
                secure:false,
                ws:true,
                changeOrigin:true,
                pathRewrite:{
                    '^/api':''
                }
            }
        }

    },
    publicPath:'./',
}