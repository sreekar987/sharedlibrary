def gitcheckout(Map config = [:])
{
 git (url: "{config:giturl}",
 branch: "${config:Gitbranch}" ,
 credentialsId: "Git_hub_credentails" )
}
