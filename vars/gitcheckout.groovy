def call(Map config = [:])
{
 git (url: "${config:Giturl}",
 branch: "${config:Gitbranch}" ,
 credentialsId: "Git_hub_credentails" )
}
